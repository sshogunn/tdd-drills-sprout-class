package com.epam.engx.tdd.drills;

/**
 * @author Nurmakanov
 */
class Department {
    private String department;
    private String manager;
    private int netProfit;
    private int operatingExpense;

    String getDepartment() {
        return department;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    String getManager() {
        return manager;
    }

    void setManager(String manager) {
        this.manager = manager;
    }

    int getNetProfit() {
        return netProfit;
    }

    void setNetProfit(int netProfit) {
        this.netProfit = netProfit;
    }

    int getOperatingExpense() {
        return operatingExpense;
    }

    void setOperatingExpense(int operatingExpense) {
        this.operatingExpense = operatingExpense;
    }
}
