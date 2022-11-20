package Section09CodingExercises.AbstractClass;

public class Node extends ListItem {
    public Node(Object object) {
        super(object);
    }

    @Override
    ListItem next() {
        return super.rightLink;
    }

    @Override
    ListItem setNext(ListItem listItem) {
        super.rightLink = listItem;
        return super.rightLink;
    }

    @Override
    ListItem previous() {
        return super.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem listItem) {
        super.leftLink = listItem;
        return super.leftLink;
    }

    @Override
    int compareTo(ListItem listItem) {
        if (listItem != null) {
            return (((String) super.getValue()).compareTo((String) listItem.getValue()));
        } else {
            return -1;
        }
    }
}
