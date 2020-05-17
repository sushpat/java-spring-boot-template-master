# Sample file operations

import fileinput
import re

config_dict = {}
with open(r"C:\ProgrammingZone\FOSS\foss_dev\python-template\restapp\config.txt", 'r') as config_file:
    for line in config_file:
        (key, value) = line.strip().split(" ", 1)
        config_dict[key] = value.strip()
config_file.close()
print(config_dict)

with open(r"C:\ProgrammingZone\FOSS\foss_dev\python-template\restapp\sample.yaml", 'r') as input_file, open("sample1.yaml", 'w') as out_file:
    for line in input_file:
        print(line)
        try:
            config_value = config_dict.get(re.search('{{(.*)}}', line).group(1))
        except:
            config_value = None
        #print(config_value)
        if config_value is None:
            out_file.write(line)
        else:
            out_file.write(re.sub(r'{{(.*)}}', config_value, line))
            #print(re.sub(r'{{(.*)}}', config_value, line))
        # re.sub('^(.{{?, )?(.*?)( \}\})$', '\\2', "hello")
        # print("\n")
file.close()
