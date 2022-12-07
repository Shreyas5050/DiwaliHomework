//You are given a list of strings, times, where each string represent a timestamp of a twenty-four hour clock (i.e. hours and minutes - “HH:MM”). Return the minimum difference, in minutes, between any two of the timestamps in the list.
Ex: Given the following times…
times = ["01:00", "01:10"], return 10 (i.e. there are 10 minutes between the two times).
Ex: Given the following times…
times = ["00:00", "12:23", "05:50", "23:12"], return 48.


import datetime as dt
from dateutil.relativedelta import relativedelta

start = "09:35:23"
end = "10:23:00"
start_dt = dt.datetime.strptime(start, "%H:%M:%S")
end_dt = dt.datetime.strptime(end, "%H:%M:%S")
timedelta_obj = relativedelta(start_dt, end_dt)
print(
    timedelta_obj.years,
    timedelta_obj.months,
    timedelta_obj.days,
    timedelta_obj.hours,
    timedelta_obj.minutes,
    timedelta_obj.seconds,
)