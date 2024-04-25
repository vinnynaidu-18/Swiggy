package org.example.MapDemo;

import java.util.Objects;

public class TicketDetails {

    public String pnrNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketDetails that = (TicketDetails) o;
        return Objects.equals(pnrNumber, that.pnrNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pnrNumber);
    }
}
