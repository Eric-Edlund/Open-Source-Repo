// Bugged by Connor Brown on 10/24/23
// Changed for in range loop to while loop on line 7
// Changed if statment from == to != on line 8

with open("numbers.html", "w") as f:
    f.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n")
    f.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n")
    while i <= 50:
        if i % 2 != 0:
            f.write("<tr><td>{}</td><td></td></tr>\n".format(i))
        else:
            f.write("<tr><td></td><td>{}</td></tr>\n".format(i))
    f.write("</table>\n</body>\n</html>")

with open("numbers.html", "r") as f:
    print(f.read())
    
