/*
 * Copyright 2018 Stéphane Baiget
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cinema.entract.remote.mapper

import com.cinema.entract.data.model.MovieData
import com.cinema.entract.remote.model.MovieRemote
import org.threeten.bp.LocalDate

class MovieRemoteMapper : RemoteMapper<MovieRemote, MovieData> {

    override fun mapToData(model: MovieRemote): MovieData = MovieData(
        model.id_film ?: "",
        model.titre ?: "",
        LocalDate.parse(model.date) ?: error("Unknown date"),
        model.horaire ?: "",
        model.troisDimension ?: false,
        model.vo ?: false,
        model.moins_douze ?: false,
        model.affiche ?: "",
        model.duree ?: "",
        model.annee ?: "",
        model.style ?: "",
        model.de ?: "",
        model.avec ?: "",
        model.synopsis ?: "",
        model.bande_annonce ?: "",
        model.autres_dates?.map { mapToData(it) } ?: emptyList()
    )
}