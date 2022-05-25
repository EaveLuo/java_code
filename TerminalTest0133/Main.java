import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author EaveLuo
 * @editTimestamp 2022-05-25 13:31
 * @version 1.0
 */
public class Main {

    // 初始化歌曲列表
    public static void initializeSongList(ArrayList<String> songList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------欢迎来到EaveLuo的KTV-------");
        System.out.print("您是否需要随机点一批热门歌曲？y/n：");
        String input = scanner.next();
        if ("Y".equalsIgnoreCase(input)) {
            addRandomHotSong(songList, 10);
        }
    }

    // 展示歌曲列表
    public static void showSongList(ArrayList<String> songList) {
        System.out.println("-------已点歌曲列表（最大容量为20）-------");
        // 按顺序给歌曲加序号
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 1; i <= songList.size(); i++) {
            newList.add(i + "." + songList.get(i - 1));
        }
        System.out.println(songList.isEmpty() ? "您还未点歌呢，赶快去点歌呀！" : newList);
    }

    // 1.添加歌曲
    public static Boolean addSong(ArrayList<String> songList, String needSong) {
        if (songList.size() < 20) {
            songList.add(needSong);
            System.out.println("添加成功！");
            return true;
        } else {
            System.out.println("添加失败，已点歌单的最大容量为20哦!");
            return false;
        }

    }

    // 2.随机添加热门歌曲
    public static void addRandomHotSong(ArrayList<String> songList, int needSize) {
        try {
            String[] hotSongList = {"遥远的她-毛不易", "三人游-方大同", "最佳损友-毛不易/李克勤",
                    "单车-陈奕迅", "喜欢你-陈洁仪", "这世界那么多人-林志炫", "晴天-周杰伦",
                    "偏偏喜欢你-陈百强", "青花瓷-周杰伦", "平凡之路-朴树",
                    "爱你-王心凌", "孤勇者-陈奕迅", "后来的我们-五月天", "稻香-周杰伦", "花海-周杰伦",
                    "红色高跟鞋-蔡健雅", "偏爱-张芸京", "这世界那么多人-莫文蔚", "夜曲-周杰伦",
                    "修炼爱情-林俊杰", "江南-林俊杰", "十年-陈奕迅"};
            for (int i = 1; i <= needSize; i++) {
                if (songList.size() == 20) {
                    System.out.println("成功添加" + (i - 1) + "首歌曲，有" + (needSize - i + 1) + "首歌曲添加失败，已点歌单的最大容量为20哦!");
                    return;
                }
                int songId = new Random().nextInt(hotSongList.length - 1);
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
    public static void topSong(ArrayList<String> songList, String input) {
        try {
            Scanner scanner = new Scanner(System.in);
            if (input.matches("[0-9]+")) {
                if (songList.size() >= Integer.parseInt(input)) {
                    String needSong = songList.get(Integer.parseInt(input) - 1);
                    for (int i = Integer.parseInt(input) - 1; i > 0; i--) {
                        songList.set(i, songList.get(i - 1));
                    }
                    songList.set(0, needSong);
                } else {
                    System.out.println("您输入的歌曲序号有误，请重试！");
                }
            } else {
                if (songList.contains(input)) {
                    int needIndex = songList.indexOf(input);
                    for (int i = needIndex; i > 0; i--) {
                        songList.set(i, songList.get(i - 1));
                    }
                    songList.set(0, input);
                } else {
                    System.out.print("您输入的歌曲在已点歌单中不存在，是否将其添加至歌单并置顶？y/n：");
                    if ("Y".equalsIgnoreCase(scanner.next())) {
                        Boolean res = addSong(songList, input);
                        if (res) {
                            topSong(songList, input);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("置顶失败，请重试！");
        }
    }

    // 4.打乱歌单顺序
    public static void disruptSongList(ArrayList<String> songList) {
        // 外循环为打乱轮数，默认打乱两次，一次打乱效果不明显
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < songList.size(); j++) {
                int randomNum1 = new Random().nextInt(songList.size());
                int randomNum2 = new Random().nextInt(songList.size());
                String temp = songList.get(randomNum1);
                songList.set(randomNum1, songList.get(randomNum2));
                songList.set(randomNum2, temp);
            }
        }
    }

    // 5.删除歌曲
    public static void deleteSong(ArrayList<String> songList) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        try {
            if (input.matches("[0-9]+")) {
                if (songList.size() >= Integer.parseInt(input)) {
                    songList.remove(Integer.parseInt(input) - 1);
                } else {
                    System.out.println("删除失败，您输入的歌曲序号有误！");
                }
            } else {
                if (songList.contains(input)) {
                    songList.remove(input);
                } else {
                    System.out.print("删除失败，您输入的歌曲在已点歌单中不存在！");
                }
            }
        } catch (Exception e) {
            System.out.println("删除失败，请重试！");
        }
    }

    // 菜单栏
    public static void Menu(ArrayList<String> songList) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showSongList(songList);
            System.out.println("--------------------------------");
            System.out.println("1.添加新歌曲");
            System.out.println("2.随机添加热门歌曲");
            System.out.println("3.将歌曲置顶");
            System.out.println("4.打乱歌单顺序");
            System.out.println("5.删除歌曲");
            System.out.println("6.清空歌单");
            System.out.println("0.退出");
            System.out.print("请输入您要执行的操作：");
            try {
                String input = scanner.next();
                switch (input) {
                    case "1":
                        System.out.print("请输入您需要添加的歌曲名：");
                        String addSongName = scanner.next();
                        System.out.print("请输入您需要添加歌曲的歌手名：");
                        String addSingerName = scanner.next();
                        addSong(songList, addSongName + "-" + addSingerName);
                        break;
                    case "2":
                        System.out.print("请输入您需要添加的歌曲数：");
                        int needSize = scanner.nextInt();
                        addRandomHotSong(songList, needSize);
                        break;
                    case "3":
                        System.out.print("请输入需要置顶的歌曲编号或歌曲名称-歌手名称：");
                        String input3 = scanner.next();
                        topSong(songList, input3);
                        break;
                    case "4":
                        disruptSongList(songList);
                        break;
                    case "5":
                        System.out.print("请输入需要删除的歌曲编号或歌曲名称-歌手名称：");
                        deleteSong(songList);
                        break;
                    case "6":
                        System.out.print("您确定要清空歌单吗？y/n：");
                        String input6 = scanner.next();
                        if ("Y".equalsIgnoreCase(input6)) {
                            songList.clear();
                        }
                        break;
                    case "0":
                        System.out.println("--------------------------------");
                        System.out.println("感谢您的使用！");
                        System.exit(0);

                    default:
                        System.out.println("--------------------------------");
                        System.out.println("功能选择错误，请输入正确的功能序号！");
                        break;
                }
            } catch (Exception e) {
                System.out.println("发生异常，请重启程序！");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> songList = new ArrayList<>(20);
        initializeSongList(songList);
        Menu(songList);
    }
}
