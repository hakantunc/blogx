import Control.Lens

main = do
  let pair = ("fst", 3)
  print $ view _1 pair
  print $ over _1 (++ "!") pair
  print $ set _1 "1st" pair
