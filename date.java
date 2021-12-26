class date
{
    int n;
    int d;
    int m;
    int y;
    date(int d, int m, int y)
    {
        this.d=d;
        this.m=m;
        this.y=y;
    }

    int getday()
    {
        return d;
    }

    int getmonth()
    {
        return m;
    }

    int getyear()
    {
        return y;
    }
}