package ru.gb.dz17.data

import ru.gb.dz17.photo

class PhotoRepository
{
    suspend fun getPhoto():List<PhotoFromMars>{
        return photo.getPhotoFromApi().photos
    }
}