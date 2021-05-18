package acm.day0511;

import java.util.*;

/**
 * @author Wangmingcan
 * @date 2021/5/11 17:07
 * @description
 * 链接：https://ac.nowcoder.com/acm/contest/16391/D
 * 来源：牛客网
 *
 * 题目描述
 * 给定一场CCPC比赛的题目数量和提交列表，请你输出终榜。
 *
 * 榜单的格式见输出和样例
 *
 * 根据比赛规则，榜单有以下要求：
 *
 * 1. 每道题的通过罚时按照分钟计算。每次未通过提交增加20分钟罚时，保证每个队伍罚时均小于10000分钟。
 * 到比赛结束都没有通过的题目不计入该队伍的罚时。
 *
 * 2. 每队通过后的题目在榜单的题目栏中用 + 显示。如果仅提交一次就通过了，则显示 +。
 * 否则显示+k，k为这个队伍对于这道题，第一次通过前，所提交未通过的次数。保证 k 不大于 9。
 *
 * 3. 每队提交但是未通过的题目在榜单的题目栏中用 -k 显示，k为这个队伍对于这道题的总提交次数。保证 k 不大于9。
 *
 * 4. 每队没有提交的题目需要在榜单的该队的题目栏留空。
 *
 * 5. 由于大家都讨厌`CE`，所以状态为`Compile Error`的提交不计入榜单。
 *
 * 6. 众所周知，对于某个队伍来说，在通过某个题目后再次提交该题目，则通过后的提交不计入榜单。
 *
 * 7. 如果某个队伍没有提交，或者所有的提交均不计入榜单。则榜单上不显示该队伍。
 * 输入描述:
 * 第一行一个数字 n，表示这场比赛有 n 道题目，题目的标号从 A开始。
 *
 * 接下来若干行，每行格式形如：`时间 题号 结果 队名`，表示一条提交，提交按时间顺序排列。
 *
 * 其中，时间形如`HH:MM`，并且时间一定小于`05:00`。
 *
 * 题号为单独的一个大写字母。
 *
 * 结果属于集合 { `Accepted`, `Wrong Answer`, `Time Limit Exceeded`,  `Compile Error`, `Memory Limit Exceeded`,
 * `Output Limit Exceeded`, `Runtime Error`, `Presentation Error` }。
 *
 * 队名为一个含有空格、大写和小写字母的字符串，队名长度不超过 50。
 *
 * 输入以一行 `GAME OVER!` 结尾，表示比赛结束。
 *
 * 数据保证最多有5000条提交记录。n \leq 14n≤14
 * 输出描述:
 * 输出的榜单有 n+4 栏，每栏之间间隔 2 个空格。
 *
 * Rank 一栏的宽度为 4 个字符，表示该队伍的排名
 *
 * Who 一栏的宽度为所有显示在榜单上的队伍名字的最长长度，表示该队伍的名字
 *
 * Solved 一栏宽度为 6 个字符，显示每个队伍通过题目的数量
 *
 * Penalty 一栏宽度为 7 个字符，按要求显示每队罚时
 *
 * 接下来是题目栏，每个题目栏的宽度均为 3 个字符，按要求显示`+`或`-`，表示每个队伍通过题目的情况
 *
 * 每一栏的第一行为这一栏的名称，其中，Who 需左对齐，其他栏需右对齐。
 *
 * 题目栏的名称为题目的标号
 *
 * 接下来若干行，按顺序输出每个队伍的信息，每栏的信息需右对齐。
 *
 * 队伍按照通过题目数量排名，如果两队通过题目数量相等，罚时少的队伍排名靠前。
 *
 * 注意，如果出现题数和罚时均相等的队伍，则按照队名的字典序排序，同时`Rank`一栏的值需相等。
 * 第一个与他们排名不相等的队伍的排名可以是绝对排名或相对排名。
 * 例如前五个队伍的排名分别为1,2,3,3,3,则第六个队伍的绝对排名为5，相对排名为4，你的程序只需要按照一种方式输出即可，
 * 即1,2,3,3,3,5和1,2,3,3,3,4两种输出均正确，但是你需要保证你的程序对于所有输入均按照一种方式输出。
 *
 * 链接：https://ac.nowcoder.com/acm/contest/16391/D
 * 来源：牛客网
 *
 * 输入
 * 4
 * 00:01 B Wrong Answer University of Deep Dark Fantasy
 * 00:01 B Accepted University of Deep Dark Fantasy
 * 00:01 C Accepted University of Deep Dark Fantasy
 * 00:01 D Accepted University of Deep Dark Fantasy
 * 00:11 A Accepted Deep Dark Institude of Fantasy
 * 00:13 C Wrong Answer Banana University
 * 01:01 C Wrong Answer Banana University
 * 01:11 C Wrong Answer Banana University
 * 02:01 C Runtime Error Deep Dark Institude of Fantasy
 * 02:10 C Accepted Deep Dark Institude of Fantasy
 * 02:30 A Accepted University of Deep Dark Fantasy
 * 02:50 D Accepted Bon Sha Ka La Ka Higher School of Economics
 * 02:51 C Accepted Bon Sha Ka La Ka Higher School of Economics
 * 02:52 B Accepted Bon Sha Ka La Ka Higher School of Economics
 * 02:53 A Accepted Bon Sha Ka La Ka Higher School of Economics
 * 02:55 A Runtime Error University Van Billy
 * 02:59 B Compile Error University Van Banana
 * GAME OVER!
 *
 * 输出
 * Rank  Who                                          Solved  Penalty    A    B    C    D
 *    1              University of Deep Dark Fantasy       4      173    +   +1    +    +
 *    2  Bon Sha Ka La Ka Higher School of Economics       4      686    +    +    +    +
 *    3               Deep Dark Institude of Fantasy       2      161    +        +1
 *    4                            Banana University       0        0             -3
 *    4                         University Van Billy       0        0   -1
 */
public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Team> teamMap = new HashMap<>();
        int maxNameLength = 0;
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals("GAME OVER!")) {
                break;
            }
            String[] strings = s.split(" ");
            if (strings[2].charAt(0) == 'C') {
                continue;
            }
            StringBuilder teamName = new StringBuilder("");
            if (strings[2].charAt(0) == 'A') {
                for (int i = 3; i < strings.length;i++) {
                    teamName.append(strings[i]);
                }
            }else if (strings[2].charAt(0) == 'T' || strings[2].charAt(0) == 'M' ||strings[2].charAt(0) == 'O') {
                for (int i = 5; i < strings.length;i++) {
                    teamName.append(strings[i]);
                }
            }else {
                for (int i = 4; i < strings.length;i++) {
                    teamName.append(strings[i]);
                }
            }
            Team team = teamMap.get(teamName.toString());
            if (team == null) {
                team = new Team();
                team.name = teamName.toString();
                maxNameLength = maxNameLength < team.name.length() ?team.name.length():maxNameLength;
                for (int i = 0;i < n;i++) {
                    Problem problem = new Problem();
                    team.problems.add(problem);
                }
                teamMap.put(teamName.toString(), team);
            }
            if (strings[2].charAt(0) == 'A') {
                Problem problem = team.problems.get(strings[1].charAt(0) - 'A');
                if (problem.status) {
                    continue;
                }
                team.solved++;
                problem.status = true;
                String[] times = strings[0].split(":");
                team.penalty+= 20*problem.wrong + Integer.valueOf(times[0])*60 + Integer.valueOf(times[1]);
                team.problems.set(strings[1].charAt(0) - 'A', problem);
            }else{
                Problem problem = team.problems.get(strings[1].charAt(0) - 'A');
                problem.wrong++;
                team.problems.set(strings[1].charAt(0) - 'A', problem);
            }
            team.zuo = true;
        }
        List<Team> maplist = new ArrayList<>(teamMap.values());
        List<Team> finalTeams = new ArrayList<>();
        for (int i = 0; i < maplist.size();i++) {
            if (maplist.get(i).zuo) {
                finalTeams.add(maplist.get(i));
            }
        }
        TeamComparator comparator = new TeamComparator();
        for(int i =0 ; i<finalTeams.size()-1 ; i++) {
            for(int j=0 ; j<finalTeams.size()-1-i ; j++) {
                if (comparator.compare(finalTeams.get(j), finalTeams.get(j+1)) ==1) {
                    Team team = finalTeams.get(j);
                    finalTeams.set(j, finalTeams.get(j+1));
                    finalTeams.set(j+1, team);
                }
            }
        }
        System.out.println();
    }
}
class Team {
    String name;
    int solved;
    int penalty;
    boolean zuo;
    ArrayList<Problem> problems = new ArrayList<>();
}

class Problem {
    boolean status;
    int wrong;
}

class TeamComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Team t1 = (Team) o1;
        Team t2 = (Team) o2;
        if (t1.solved > t2.solved) {
            return 1;
        }
        if (t1.solved < t2.solved) {
            return 2;
        }
        if (t1.penalty < t2.penalty) {
            return 1;
        }
        if (t1.penalty > t2.penalty) {
            return 2;
        }
        for(int i = 0; i < t1.name.length() && i < t2.name.length();i++) {
            if (t1.name.charAt(i) < t2.name.charAt(i)) {
                return 1;
            }
            if (t1.name.charAt(i) > t2.name.charAt(i)) {
                return 2;
            }
        }
        if (t1.name.length() < t2.name.length()) {
            return 1;
        }
        if (t1.name.length() > t2.name.length()) {
            return 2;
        }

        return 0;
    }
}