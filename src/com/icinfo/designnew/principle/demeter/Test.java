package com.icinfo.designnew.principle.demeter;

public class Test {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        Boss boss = new Boss();
        boss.commandCheckNumber(teamLeader);
    }
}
