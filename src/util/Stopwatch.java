package util;

public class Stopwatch
{
    private long time = System.currentTimeMillis();

    public Stopwatch headStart(long startAt)
    {
        this.time = (System.currentTimeMillis() - startAt);
        return this;
    }

    public Stopwatch reset(long i)
    {
        this.time = i;
        return this;
    }

    public Stopwatch reset()
    {
        this.time = System.currentTimeMillis();
        return this;
    }

    public long elapsed()
    {
        return System.currentTimeMillis() - this.time;
    }

    public boolean elapsed(long time)
    {
        return elapsed() >= time;
    }

    public long getTime()
    {
        return this.time;
    }

    public Stopwatch()
    {
        this.time = 0L;
    }
}
