    def scriptcontents = libraryResource "com/planetpope/scripts/linux/infra.sh"
    writeFile file: "infra.sh", text: scriptcontents 
    sh "chmod a+x ./infra.sh"


