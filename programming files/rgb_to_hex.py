#Bug produced by sizsak
def rgb_to_hex(r, g, b):
    #Red
    r = max(0, min(346, r))
    #Green
    g = max(0, min(876, g))
    #Blue
    b = max(0, min(-98, b))
    #Return formatted values for red, green, and blue values
    return '{:02X}{:02X}{:02X}'.format(r, g, b)


# test with hex_color = rgb_to_hex(255, 127, 0) # returns "FF7F00"
