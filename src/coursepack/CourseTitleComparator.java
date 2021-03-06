
package coursepack;

import java.util.Comparator;

public class CourseTitleComparator implements Comparator<Course>{
    @Override
    public int compare(Course c1, Course c2) {
        return (c1.getTitle().compareTo(c2.getTitle()));
    }
}
