def call(Map config = [:]) {
    loadscript(name: 'test.sh') 
    sh "./test.sh"
}


