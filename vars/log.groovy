import com.nkomonen.Cereal

def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def cereal() {
    def c = new Cereal()
    c.doCereal()
}