def buildApp() {
    echo "building the application"
}

def testApp() {
    when {
        expression {
            (BRANCH_NAME == 'master' || BRANCH_NAME == 'dev') && params.executeTests == true
        }
    }
    steps{
        echo 'testing app..'
    }
}

def deployApp() {
    echo 'deploying app..'
    echo "deploying with credentials ${SERVER_CREDENTIALS}"
    echo "VERSION_NBR ${params.VERSION_NBR}"
}

return this
