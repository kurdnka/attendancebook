package cz.curlybracket.attendancebook;

import javafx.collections.transformation.SortedList;

import java.util.List;

public class AttendanceManagerImpl implements AttendanceManager {

	/**
	 *
	 * @param type
	 */
	public List<Employee> findEmployeesByAttendanceType(EntryType type) {
		// TODO - implement AttendanceManagerImpl.findEmployeesByAttendanceType
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param employee
	 */
	public boolean doesEmployeeFulfillTheirWorkLoad(Employee employee) {
		// TODO - implement AttendanceManagerImpl.doesEmployeeFulfillTheirWorkLoad
		return true;
	}

	/**
	 *
	 * @param position
	 */
	public List<Employee> findEmployeesPresentByPosition(String position) {
		// TODO - implement AttendanceManagerImpl.findEmployeesPresentByPosition
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param employee
	 */
	public SortedList<BookEntry> getAttendanceHistoryByEmployee(Employee employee) {
		// TODO - implement AttendanceManagerImpl.getAttendanceHistoryByEmployee
		throw new UnsupportedOperationException();
	}

    /**
     * toto vazne nejdem implementovat...
     *
    public void checkIfEpidemicBeingSpread() {
		// TODO - implement AttendanceManagerImpl.checkIfEpidemicBeingSpread
		throw new UnsupportedOperationException();
	}
     */

}