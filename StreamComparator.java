package OOPSem03;

import java.util.Comparator;
public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream stream1, Stream stream2) {
        return stream1.studentGroups.size() - stream2.studentGroups.size();
    }
}
