package OOPSem03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stream stream1 = new Stream();
        stream1.addStudentGroup(new StudentGroup("Group1", 20));
        stream1.addStudentGroup(new StudentGroup("Group2", 25));

        Stream stream2 = new Stream();
        stream2.addStudentGroup(new StudentGroup("Group3", 15));

        Stream stream3 = new Stream();
        stream3.addStudentGroup(new StudentGroup("Group4", 30));
        stream3.addStudentGroup(new StudentGroup("Group5", 35));

        List<Stream> streamList = new ArrayList<>();
        streamList.add(stream1);
        streamList.add(stream2);
        streamList.add(stream3);

        StreamService streamService = new StreamService();
        streamService.sortStreams(streamList);

        for (Stream stream : streamList) {
            System.out.println("Stream with " + stream.studentGroups.size() + " groups:");
            for (StudentGroup group : stream) {
                System.out.println(group);

            }
        }
    }
}
