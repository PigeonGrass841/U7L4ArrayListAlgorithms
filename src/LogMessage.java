public class LogMessage
{
    private String machineId;
    private String description;
    /** Precondition: message is a valid log message. */
    public LogMessage(String message)
    {
        machineId = message.substring(0, message.indexOf(":"));
        description = message.substring(message.indexOf(":") + 1);
    }
    /** Returns true if the description in this log message properly contains keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword)
    {
        int index = description.indexOf(keyword);
        while (index != -1)
        {
            if (description.equals(keyword))
            {
                return true;
            }
            else if ((index == 0 || description.substring(index - 1, index).equals(" ")) && (index == description.length() - keyword.length() || description.substring(index + keyword.length(), index + keyword.length() + 1).equals(" ")))
            {
                return true;
            }
            description = description.substring(index + keyword.length());
            index = description.indexOf(keyword);
        }
        return false;
    }
    public String getMachineId()
    { return machineId; }
    public String getDescription()
    { return description; }
// There may be instance variables, constructors, and methods that are not shown.
}
