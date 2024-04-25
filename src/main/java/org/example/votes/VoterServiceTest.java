package org.example.votes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VoterServiceTest {
    public static void main(String[] args) {
        VoterDetails voter1 = new VoterDetails();
        voter1.name = "VINNY";
        voter1.aadharNo = "1111";
        voter1.status = "Yes";

        VoterDetails voter2 = new VoterDetails();
        voter2.name = "CHANDHU";
        voter2.aadharNo = "1122";
        voter2.status = "No";

        VoterDetails voter3 = new VoterDetails();
        voter3.name = "SWEETY";
        voter3.aadharNo = "2222";
        voter3.status = "Yes";

        VoterDetails voter4 = new VoterDetails();
        voter4.name = "CHINNI";
        voter4.aadharNo = "3333";
        voter4.status = "Yes";

        VoterDetails voter5 = new VoterDetails();
        voter5.name = "GOPI";
        voter5.aadharNo = "4444";
        voter5.status = "No";

        List<VoterDetails> voterList = new ArrayList<>();
        voterList.add(voter1);
        voterList.add(voter2);
        voterList.add(voter3);
        voterList.add(voter4);
        voterList.add(voter5);
        voterList.add(voter1);
        voterList.add(voter4);

        Iterator<VoterDetails> iterator = voterList.iterator();

        List<String> seenAadharNo = new ArrayList<>();
        for (; iterator.hasNext(); ) {
            VoterDetails voter = iterator.next();
            if (!seenAadharNo.contains(voter.aadharNo)) {
                seenAadharNo.add(voter.aadharNo);
                if (voter.status.equals("Yes")) {
                    System.out.println(voter.name + " has casted his vote.");
                } else {
                    System.out.println(voter.name + " has not casted his vote.");
                }
            } else {
                System.out.println(voter.name + " is already in list. This is duplicate.");
            }
          }

    }

}