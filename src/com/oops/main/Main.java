package com.oops.main;

import com.oops.main.models.AdminDepartment;
import com.oops.main.models.HrDepartment;
import com.oops.main.models.TechDepartment;

public class Main {

	public static void main(String[] args) {

		HrDepartment hrDepartment = new HrDepartment();
		AdminDepartment adminDepartment = new AdminDepartment();
		TechDepartment techDepartment = new TechDepartment();

		// Admin department will display all the details
		String adminDepartmentName = adminDepartment.departmentName();
		String adminsTodaysWork = adminDepartment.getTodaysWork();
		String adminsWorkDeadline = adminDepartment.getWorkDeadline();
		String adminsHoliday = adminDepartment.isTodayAHoliday();

		System.out.println(String.format("Welcome to %s", adminDepartmentName));
		System.out.println(adminsTodaysWork);
		System.out.println(adminsWorkDeadline);
		System.out.println(adminsHoliday);
		System.out.println();

		// Hr department will display all the details
		String hrDepartmentName = hrDepartment.departmentName();
		String hrDepartmentActivity = hrDepartment.doActivity();
		String hrDepartmentsTodaysWork = hrDepartment.getTodaysWork();
		String hrDepartmentWorkDeadline = hrDepartment.getWorkDeadline();
		String hrDepartmentsHoliday = hrDepartment.isTodayAHoliday();

		System.out.println(String.format("Welcome to %s", hrDepartmentName));
		System.out.println(hrDepartmentActivity);
		System.out.println(hrDepartmentsTodaysWork);
		System.out.println(hrDepartmentWorkDeadline);
		System.out.println(hrDepartmentsHoliday);
		System.out.println();

		// Tech Department will display all the details
		String techDepartmentName = techDepartment.departmentName();
		String techDepartmentsTodaysWork = techDepartment.getTodaysWork();
		String techDepartmentWorkDeadline = techDepartment.getWorkDeadline();
		String techDepartmentTechStack = techDepartment.getTechStackInformation();
		String techDepartmentHoliday = techDepartment.isTodayAHoliday();

		System.out.println(String.format("Welcome to %s", techDepartmentName));
		System.out.println(techDepartmentsTodaysWork);
		System.out.println(techDepartmentWorkDeadline);
		System.out.println(techDepartmentTechStack);
		System.out.println(techDepartmentHoliday);

	}

}
