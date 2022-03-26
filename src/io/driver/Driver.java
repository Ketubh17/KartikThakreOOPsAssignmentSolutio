package io.driver;

import io.adminDepartment.adminDepartment;
import io.hrDepartment.hrDepartment;
import io.superDepartment.superDepartment ;
import io.techDepartment.techDepartment;
public class Driver
{

	public static void main(String args[])
	{
		superDepartment sd =new superDepartment();
		
		adminDepartment ad = new adminDepartment();
		
		hrDepartment hr= new hrDepartment();
		
		techDepartment td= new techDepartment();
		
		System.out.println(ad.departmentName()+'\n'+ad.getTodayWork()+'\n'+ad.getWorkDeadline()+'\n'+sd.isTodayAHoliday()+'\n');
		
		System.out.println(hr.departmentName()+'\n'+hr.doActivity()+'\n'+hr.getTodayWork()+'\n'+hr.getWorkDeadline()+'\n'+sd.isTodayAHoliday()+'\n');
		
		System.out.println(td.departmentName()+'\n'+td.getTodayWork()+'\n'+td.getWorkDeadline()+'\n'+td.getStackTechInformation()+'\n'+sd.isTodayAHoliday()+'\n');
		
	}
}
