/**
 * Created by Max on 08.02.2017.
 */
enum SortOrder {Ascending, Descending}
public interface Sortable {
    void sort(SortOrder order);
}
