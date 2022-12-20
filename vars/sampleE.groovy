def call(Map config = [:]) {
    loadscript(name: 'test.sh') 
    sh "./bash test.sh"
}


