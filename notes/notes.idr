--- REPL

-- import libraries
-- `:module Data.Vect`
-- `:exec`


--- Documentation comments

-- Query it with repl as `:doc Shape`
||| Represents shapes
data Shape = ||| A triangle, with its base length and height
             Triangle Double Double
           | ||| A rectangle, with its length and height
             Rectangle Double Double
           | ||| A circle, with its radius
             Circle Double

--------------------------
--- Types in Idris
-- 1. Enumerated types
data Bool = False | True
-- 2. Union types
data Shape = Triangle Double Double
           | Circle Double
-- or alternatively
data Shape' : Type where
  Triangle' : Double -> Double -> Shape'
  Circle' : Double -> Shape'
-- 3. Recursive types
data Nat = Z | S Nat
-- 4. Generic types
data Either a b = Left a | Right b
-- 5. Dependent types
data PowerSource = Petrol | Pedal
data Vehicle : PowerSource -> Type where
  Bicycle : Vehicle Pedal
  Car : (fuel : Nat) -> Vehicle Petrol
  Bus : (fuel : Nat) -> Vehicle Petrol

--------------------------
--- Better default names
%name Shape shape, shape1

---
-- f = do
--   Just x <- readNumber | Nothing => pure Nothing

-- dependent pairs
anyVect : (n : Nat ** Vect n String)
anyVect = (3 ** ["Rod", "Jane", "Freddy"])
