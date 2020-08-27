package Structural.Adapter;

public class Client {

    public static void main(String[] args) {

        // Using class adapter
        EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
        setEmployeeData(classAdapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(classAdapter);
        System.out.println(card);

        // Using object adapter
        Employee employee = new Employee();
        setEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card = designer.designCard(objectAdapter);
        System.out.println(card);

    }

    public static void setEmployeeData(Employee employee) {
        employee.setFullName("Szymon");
        employee.setJobTitle(":)");
        employee.setOfficeLocation(":))");
    }
}
