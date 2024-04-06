package org.example.object;

public class ObjectTest {

    public static void main(String[]args){
        Country country=new Country();
        State st=new State();
        st.language="Telugu";
        st.name="Telangana";
        st.noOfDistricts="08";
        st.stateCM="CM";
        st.country=country;

        country.countryCapital="New Delhi";
        country.code="+91";
        country.currency="rupees";
        country.language="English";
        country.state=st;
    }
}
