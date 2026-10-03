import React, { useState } from "react";

import img1 from "../assets/crousel_Image1.jpg";
import img2 from "../assets/crousel_Image2.jpg";
import img3 from "../assets/crousel_Image3.jpg";

const Crousel = () => {

  const [currentSlide, setCurrentSlide] = useState(0);

  const images = [img1, img2, img3];

  const nextSlide = () => {
    setCurrentSlide((prev) => (prev + 1) % images.length);
  };

  const prevSlide = () => {
    setCurrentSlide(
      (prev) => (prev - 1 + images.length) % images.length
    );
  };

  return (
    <div className="relative w-full max-w-5xl mx-auto">

      {/* Image */}
      <img
        src={images[currentSlide]}
        alt={`Slide ${currentSlide + 1}`}
        className="w-full h-96 object-cover rounded-xl"
      />

      {/* Previous Button */}
      <button
        onClick={prevSlide}
        className="absolute left-4 top-1/2 -translate-y-1/2
        bg-black/50 text-white px-4 py-2 rounded-full
        hover:bg-black/70"
      >
        ❮
      </button>

      {/* Next Button */}
      <button
        onClick={nextSlide}
        className="absolute right-4 top-1/2 -translate-y-1/2
        bg-black/50 text-white px-4 py-2 rounded-full
        hover:bg-black/70"
      >
        ❯
      </button>

      {/* Dots */}
      <div className="absolute bottom-4 left-1/2 -translate-x-1/2 flex gap-2">

        {images.map((_, index) => (
          <button
            key={index}
            onClick={() => setCurrentSlide(index)}
            className={`w-3 h-3 rounded-full ${
              currentSlide === index
                ? "bg-white"
                : "bg-white/50"
            }`}
          />
        ))}

      </div>

    </div>
  );
};

export default Crousel; 