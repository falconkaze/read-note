
#!/usr/bin/env python2
# -*- coding: utf-8 -*-

from socket import *

#serverName = "localhost"
serverName = gethostname()
print serverName
serverPort = 12000
clientSocket = socket(AF_INET, SOCK_DGRAM)
message = raw_input('Input lowercase sentence:')
clientSocket.sendto(message, (serverName, serverPort))
while True:
    modifiedMessage, serverAddress = clientSocket.recvfrom(2048)
    print modifiedMessage
    print serverAddress
clientSocket.close()
