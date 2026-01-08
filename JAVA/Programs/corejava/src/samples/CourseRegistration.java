package samples;

import java.util.HashSet;

public class CourseRegistration {
	
	private HashSet<Integer> courseIds;
	
	public CourseRegistration() {
		courseIds = new HashSet<>();
	}
	public void addCourseId(int id) {
		courseIds.add(id);
    }
	
	public HashSet<Integer> getRegisteredCourses() {
		return courseIds;
	}
	

}
