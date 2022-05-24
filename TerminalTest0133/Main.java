import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    // 初始化歌曲列表
    public static void initializeSongList(ArrayList<String> songList, Scanner scanner) {
        System.out.println("------欢迎来到EaveLuo的KTV------");
        System.out.print("您是否需要随机点一批热门歌曲？");
        String input = scanner.nextLine();
        if (input.equals("需要") || input.equals("是") ||
                input.equals("是的") || input.equals("1")) {
            addRandomHotSong(songList, 10);
        }
    }

    // 展示歌曲列表
    public static void showSongList(ArrayList<String> songList) {
        System.out.println("------已点歌曲列表------");
        // 按顺序给歌曲加序号
        ArrayList<String> newList = new ArrayList<String>();
        for (int i = 1; i <= songList.size(); i++) {
            newList.add(i + "." + songList.get(i - 1));
        }
        System.out.println(songList.isEmpty() ? "您还未点歌呢，赶快去点歌呀！" : newList);
    }

    // 随机添加热门歌曲
    public static void addRandomHotSong(ArrayList<String> songList, int needSize) {
        try {
            String[] hotSongList = { "遥远的她-毛不易", "三人游-方大同", "最佳损友-毛不易/李克勤",
                    "单车-陈奕迅", "喜欢你-陈洁仪", "这世界那么多人-林志炫", "晴天-周杰伦",
                    "偏偏喜欢你-陈百强", "青花瓷-周杰伦", "平凡之路-朴树",
                    "爱你-王心凌", "孤勇者-陈奕迅", "后来的我们-五月天", "稻香-周杰伦", "花海-周杰伦",
                    "红色高跟鞋-蔡健雅", "偏爱-张芸京", "这世界那么多人-莫文蔚", "夜曲-周杰伦",
                    "修炼爱情-林俊杰", "江南-林俊杰", "十年-陈奕迅" };
            for (int i = 0; i < needSize; i++) {
                Random rand = new Random();
                int MAX = hotSongList.length - 1, MIN = 0;
                int songId = rand.nextInt(MAX - MIN + 1) + MIN;
                // TODO:some bugs in there
                if (songList.size() > hotSongList.length) {
                    System.out.println("热门歌曲已全部添加至您的歌单!");
                    return;
                }
                if (songList.contains(hotSongList[songId])) {
                    i--;
                } else {
                    songList.add(hotSongList[songId]);
                }
            }
        } catch (Exception e) {
            System.out.println("随机点歌失败，请手动点击歌曲！");
        }
    }

    // 3.将歌曲置顶
    public static void topSong(ArrayList<String> songList, Scanner scanner) {
        String input = scanner.nextLine();
        if (input.matches("[0-9]+")) {
            System.out.println(input);
        }
    }

    // 菜单栏
    public static void Menu(ArrayList<String> songList, Scanner scanner) {
        while (true) {
            showSongList(songList);
            System.out.println("--------------------------------");
            System.out.println("1.添加新歌曲");
            System.out.println("2.随机添加热门歌曲");
            System.out.println("3.将歌曲置顶");
            System.out.println("4.打乱歌单顺序");
            System.out.println("5.删除歌曲");
            System.out.println("0.退出");
            System.out.print("请输入您要执行的操作：");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println();
                    break;
                case 2:
                    System.out.print("您需要添加多少首呢？");
                    int needSize = scanner.nextInt();
                    addRandomHotSong(songList, needSize);
                    break;
                case 3:
                    System.out.print("请输入需要置顶的歌曲编号或歌曲名称-歌手名称：");
                    topSong(songList, scanner);
                    break;
                case 4:

                    break;
                case 0:
                    System.out.println("感谢您的使用！");
                    return;

                default:
                    System.out.println("--------------------------------");
                    System.out.println("功能选择错误，请输入正确的功能序号！");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> songList = new ArrayList<String>(10);
        initializeSongList(songList, scanner);
        Menu(songList, scanner);
    }
}
