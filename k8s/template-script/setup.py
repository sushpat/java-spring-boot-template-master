from cx_Freeze import setup, Executable

base = None    

executables = [Executable("test.py", base=base)]

packages = ["idna"]
options = {
    'build_exe': {    
        'packages':packages,
    },    
}

setup(
    name = "yaml-overwrite",
    options = options,
    version = "0.1",
    description = 'Generic yaml over write executable',
    executables = executables
)