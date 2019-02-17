
#!/usr/bin/env python2
# -*- coding: utf-8 -*-

import socket

serverPort = 12000
serverSocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
serverSocket.bind(('', serverPort))
serverSocket.listen(1)
print 'The server is ready to listen'
while True:
    connectionSocket, addr = serverSocket.accept()
    print addr
    sentence = connectionSocket.recv(1024)
    print sentence
    capitalizedSentence = sentence.upper()
    connectionSocket.send(capitalizedSentence)
    connectionSocket.close()
