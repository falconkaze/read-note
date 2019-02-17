
#!/usr/bin/env python2
# -*- coding: utf-8 -*-

import socket

serverName = socket.gethostname();
serverPort = 12000
clientSocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
clientSocket.connect((serverName, serverPort))
sentence = raw_input("Input message:")
clientSocket.send(sentence)
modifiedSentence = clientSocket.recv(1024)
print 'From Server:', modifiedSentence
clientSocket.close()
