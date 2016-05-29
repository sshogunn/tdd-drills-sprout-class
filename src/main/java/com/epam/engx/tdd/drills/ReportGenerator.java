package com.epam.engx.tdd.drills;

import java.util.Date;

/**
 * @author Nurmakanov
 */
public class ReportGenerator {
    private ReportGenerator() throws ComplexInitiationInATestException {
        throw new ComplexInitiationInATestException("Sometimes we have to deal with classes that are quite difficult to create");
    }

    /**
     * Goal -> add header in the table <tr><td>Department</td><td>Manager</td><td>Profit</td><td>Expenses</td></tr>
     */
    String build(Date beginDate, Date endDate) {
        DepartmentCollection results = new DatabaseGateway().queryResults(beginDate, endDate);
        String pageText = "";
        pageText += "<html><head><title>" +
                "Quarterly Report" +
                "</title></head><body><table>";
        if (results.size() != 0) {
            for (Department it = results.begin(); it != results.end(); ) {
                pageText += "<tr>";
                pageText += "<td>" + it.getDepartment() + "</td>";
                pageText += "<td>" + it.getManager() + "</td>";
                String buffer = String.format("<td>$%d</td>", it.getNetProfit() / 100);
                pageText += buffer;
                buffer = buffer + String.format("<td>$%d</td>", it.getOperatingExpense() / 100);
                pageText += buffer;
                pageText += "</tr>";
            }
        } else {
            pageText += "No results for this period";
        }
        pageText += "</table>";
        pageText += "</body>";
        pageText += "</html>";
        return pageText;
    }
}
