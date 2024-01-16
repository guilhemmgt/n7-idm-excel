def check(t1,t2,t3): 
    if t1>=t2 and t1>=t3:
        return "T1"
    elif t2>=t1 and t2>=t3:
        return "T2"
    else:
        return "T3"