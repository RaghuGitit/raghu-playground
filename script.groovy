def buildApp() {
    echo "building the application"
}

def testApp() {    
    echo 'testing app..'
}

def deployApp() {
    echo 'deploying app..'
    echo "deploying with credentials ${SERVER_CREDENTIALS}"
    echo "VERSION_NBR ${params.VERSION_NBR}"
}

return this
