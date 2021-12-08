import re


def parse(markdown):
    res = []
    for line in markdown.split('\n'):                   # split by line
        line = re.sub(r'__(.*?)__', r'<strong>\1</strong>', line)
        line = re.sub(r'_(.*?)_', r'<em>\1</em>', line)
        header_match = re.match(r'(#+) (.*)', line)     # match #### header
        if header_match and len(header_match.group(1)) < 7:
            res.append('<h{0}>{1}</h{0}>'.format(len(header_match.group(1)), header_match.group(2)))
        elif line.startswith('* '):                     # list
            if res and res[-1] == '</ul>':              # if previous line was a list
                res.pop()                               # remove the last </ul>
            else:                                       # if previous line was not a list
                res.append('<ul>')                      # start a new list
            res.append('<li>' + line[2:] + '</li>')     # add list item
            res.append('</ul>')                         # end list
        else:                                           # if not header or list, but paragraph
            res.append('<p>' + line + '</p>')           # add paragraph
    return ''.join(res)                                 # join all lines into a string
 