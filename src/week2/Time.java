package week2;

class Display
{
    private int value = 0;
    private int limit = 0;

    public Display(int limit)
    {
        this.limit = limit;
    }

    public void increase()
    {
        value++;
        if(value==limit)
        {
            value = 0;
        }
    }

    public void insert_value(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}

class Clock
{
    private Display hour;
    private Display minute;
    private Display second;

    public Clock(int now_hour, int now_minute, int now_second)
    {
        this.hour = new Display(24);
        this.minute = new Display(60);
        this.second = new Display(60);
        hour.insert_value(now_hour);
        minute.insert_value(now_minute);
        second.insert_value(now_second);
    }

    public void tick()
    {
        second.increase();
        if(second.getValue() == 0)
        {
            minute.increase();
            if(minute.getValue() == 0)
            {
                hour.increase();
            }
        }

    }

    public String toString()
    {
        return String.format("%02d",hour.getValue())+":"+String.format("%02d",minute.getValue())
                +":"+String.format("%02d",second.getValue());
    }

}
