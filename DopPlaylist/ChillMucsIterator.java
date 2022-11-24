package DopPlaylist;

import java.util.Iterator;

public class ChillMucsIterator implements Iterator<MuscItem> {
    MuscItem[] list;
    int position = 0;

    public ChillMucsIterator(MuscItem[] list) {
        this.list = list;
    }

    public MuscItem next() {
        MuscItem item = list[position];
        position = position + 1;
        return item;
    }

    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException();
        }
        if (list[position-1] != null) {
            if (list.length - 1 - (position - 1) >= 0)
                System.arraycopy(list, position - 1 + 1, list, position - 1, list.length - 1 - (position - 1));
            list[list.length-1] = null;
        }
    }

}
