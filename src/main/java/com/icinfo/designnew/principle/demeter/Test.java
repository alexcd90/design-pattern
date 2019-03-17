package com.icinfo.designnew.principle.demeter;

/**
 *  描述
 * @author jkk
 * @date 2019年03月10日
 */
public class Test {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        Boss boss = new Boss();
        boss.commandCheckNumber(teamLeader);
    }
}
