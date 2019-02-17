
#!/usr/bin/env python2
# -*- coding: utf-8 -*-

from socket import *

serverPort = 12000
serverSocket = socket(AF_INET, SOCK_DGRAM)
serverSocket.bind((gethostname(),serverPort))
print 'The server is ready to receive'
while True:
    message, clientAddress = serverSocket.recvfrom(2048)
    print message
    print clientAddress
    modifiedMessage = message.upper()
    serverSocket.sendto(modifiedMessage, clientAddress)
