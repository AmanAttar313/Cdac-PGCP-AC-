package LInkedLIstOOPS;

import java.util.LinkedList;
import java.util.Scanner;



public class Employee {
	int eId;
	String name,gender;
	float salary;
	Employee(int eId,String name,String gender,float salary){
		this.eId=eId;
		this.name=name;
		this.gender=gender;
		this.salary=salary;
		
	}
	void display() {
		System.out.println("____________Employee details are:______________");
		System.out.print("  Eid :"+eId);
		System.out.print("  name :"+name);
		System.out.print("  gender :"+gender);
		System.out.print("  salary :"+salary);
	}
	
	
	            public static void main(String[] args) {

	                // Create a LinkedList capable of storing Employee objects
	                LinkedList<Employee> list = new LinkedList<>();

	                // Scanner object to accept input from the user
	                Scanner sc = new Scanner(System.in);

	                int choice;

	                // Repeat the menu until the user selects Exit
	                do {
	                    System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
	                    System.out.println("1. Add Employee");
	                    System.out.println("2. Search Employee by ID");
	                    System.out.println("3. Delete Employee by ID");
	                    System.out.println("4. Change Employee Details");
	                    System.out.println("5. Display All Employees");
	                    System.out.println("6. Exit");

	                    System.out.print("Enter your choice: ");
	                    choice = sc.nextInt();

	                    // Execute the operation selected by the user
	                    switch (choice) {

	                        // =====================================
	                        // OPTION 1: ADD EMPLOYEE
	                        // =====================================
	                        case 1: {
	                            System.out.print("Enter Employee ID: ");
	                            int id = sc.nextInt();

	                            // Check whether the entered ID already exists
	                            boolean found = false;

	                            for (Employee e : list) {
	                                if (e.eId == id) {
	                                    found = true;
	                                    break;
	                                }
	                            }

	                            // Do not allow duplicate employee IDs
	                            if (found) {
	                                System.out.println("Employee ID already exists.");
	                            } else {
	                                // Consume the newline left by nextInt()
	                                sc.nextLine();

	                                System.out.print("Enter Name: ");
	                                String name = sc.nextLine();

	                                System.out.print("Enter Gender: ");
	                                String gender = sc.nextLine();

	                                System.out.print("Enter Salary: ");
	                                float salary = sc.nextFloat();

	                                // Create an Employee object
	                                Employee e = new Employee(
	                                        id, name, gender, salary
	                                );

	                                // Insert the employee at the end
	                                list.addLast(e);

	                                System.out.println("Employee added successfully.");
	                            }
	                            break;
	                        }

	                        // =====================================
	                        // OPTION 2: SEARCH EMPLOYEE BY ID
	                        // =====================================
	                        case 2: {
	                            System.out.print("Enter Employee ID to search: ");
	                            int id = sc.nextInt();

	                            boolean found = false;

	                            // Traverse the list to search for the employee
	                            for (Employee e : list) {

	                                // Compare the current employee ID
	                                if (e.eId == id) {

	                                    // Display details if the ID matches
	                                    e.display();

	                                    found = true;
	                                    break;
	                                }
	                            }

	                            // Display this message if no match was found
	                            if (!found) {
	                                System.out.println("Employee not found.");
	                            }
	                            break;
	                        }

	                        // =====================================
	                        // OPTION 3: DELETE EMPLOYEE BY ID
	                        // =====================================
	                        case 3: {
	                            System.out.print("Enter Employee ID to delete: ");
	                            int id = sc.nextInt();

	                            boolean found = false;

	                            // Search for the employee to be deleted
	                            for (Employee e : list) {

	                                if (e.eId == id) {

	                                    // Remove the matching Employee object
	                                    // and immediately stop traversing
	                                    list.remove(e);

	                                    found = true;
	                                    break;
	                                }
	                            }

	                            // Display the result of deletion
	                            if (found) {
	                                System.out.println("Employee deleted successfully.");
	                            } else {
	                                System.out.println("Employee not found.");
	                            }
	                            break;
	                        }

	                        // =====================================
	                        // OPTION 4: CHANGE EMPLOYEE DETAILS
	                        // =====================================
	                        case 4: {
	                            System.out.print("Enter Employee ID to update: ");
	                            int id = sc.nextInt();

	                            boolean found = false;

	                            // Find the employee using the employee ID
	                            for (Employee e : list) {

	                                if (e.eId == id) {

	                                    // Consume the newline before reading strings
	                                    sc.nextLine();

	                                    // Update the existing object's data members
	                                    System.out.print("Enter New Name: ");
	                                    e.name = sc.nextLine();

	                                    System.out.print("Enter New Gender: ");
	                                    e.gender = sc.nextLine();

	                                    System.out.print("Enter New Salary: ");
	                                    e.salary = sc.nextFloat();

	                                    // Employee ID remains unchanged
	                                    System.out.println("Employee updated successfully.");

	                                    found = true;
	                                    break;
	                                }
	                            }

	                            // Handle the case where the ID does not exist
	                            if (!found) {
	                                System.out.println("Employee not found.");
	                            }
	                            break;
	                        }

	                        // =====================================
	                        // OPTION 5: DISPLAY ALL EMPLOYEES
	                        // =====================================
	                        case 5: {

	                            // Check whether the list contains any employees
	                            if (list.isEmpty()) {
	                                System.out.println("No employees available.");
	                            } else {

	                                // Visit every Employee object in the list
	                                for (Employee e : list) {

	                                    // Display the current employee's details
	                                    e.display();

	                                    System.out.println("-------------------------");
	                                }
	                            }
	                            break;
	                        }

	                        // =====================================
	                        // OPTION 6: EXIT
	                        // =====================================
	                        case 6:
	                            System.out.println("Exiting Employee Management System.");
	                            break;

	                        // =====================================
	                        // INVALID MENU OPTION
	                        // =====================================
	                        default:
	                            System.out.println("Invalid choice. Please try again.");
	                    }

	                } while (choice != 6);

	                // Close the Scanner after completing the program
	                sc.close();
	            }

			}
	    


}
