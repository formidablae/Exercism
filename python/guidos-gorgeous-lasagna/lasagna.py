# TODO: define the 'EXPECTED_BAKE_TIME' constant
EXPECTED_BAKE_TIME = 40

# TODO: consider defining the 'PREPARATION_TIME' constant
#       equal to the time it takes to prepare a single layer
PREPARATION_TIME = 2

# TODO: define the 'bake_time_remaining()' function
def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int baking time already elapsed.
    :return: int remaining bake time derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """
    return EXPECTED_BAKE_TIME - elapsed_bake_time

# TODO: define the 'preparation_time_in_minutes()' function
#       and consider using 'PREPARATION_TIME' here
def preparation_time_in_minutes(number_of_layers):
    """Calculate the preparation time in minutes.

    :param number_of_layers: int number of layers to prepare.
    :return: int total preparation time in minutes.

    Function that takes the number of layers to prepare as an argument and
    returns the total time it will take to prepare the lasagna based on the
    `PREPARATION_TIME` and the number of layers.
    """
    return number_of_layers * PREPARATION_TIME

# TODO: define the 'elapsed_time_in_minutes()' function
def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the elapsed time in minutes.

    :param number_of_layers: int number of layers to prepare.
    :param elapsed_bake_time: int baking time already elapsed.
    :return: int total elapsed time in minutes.

    Function that takes the elapsed baking time and the number of layers to
    prepare as arguments and returns the total time it will take to prepare
    the lasagna based on the `elapsed_bake_time` and the `number_of_layers`.
    """
    return elapsed_bake_time + preparation_time_in_minutes(number_of_layers)
