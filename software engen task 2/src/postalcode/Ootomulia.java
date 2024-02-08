package postalcode;

public class Ootomulia extends PostalCode {
        public Ootomulia(String code) throws PostalCodeException
    {
        super(code);
    }
    public String getCountry()
    {
        return "Ootomulia";
    }
    protected void validate() throws PostalCodeException
    {
        String postCode = getCode();

        if(postCode.length() < 6)
            throwException("Postal code too short");

        int pos = 0; // character position within the postal code

        // STAGE 1: Expecting one or two letters
        if(!Character.isLetter(postCode.charAt(0)))
            throwException("Expecting letter at position 1");
        pos++;

        if(Character.isLetter(postCode.charAt(1)))
            pos++;

        // STAGE 3: Expecting whitespace
        if(!Character.isWhitespace(postCode.charAt(pos)))
            throwException("Expecting space at position "+(pos+1));
        pos++;

        // STAGE 5: Expecting two letters
        for(int i=0; i<2; i++)
        {
            if(postCode.length() <= pos
                    ||!Character.isLetter(postCode.charAt(pos)))
                throwException("Expecting letter at position "+(pos+1));
            pos++;
        }

        // STAGE 6: Expecting nothing
        if(postCode.length() > pos)
            throwException("Unexpected character at end of code");

        }
    }

