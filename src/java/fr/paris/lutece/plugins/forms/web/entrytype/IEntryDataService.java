/*
 * Copyright (c) 2002-2018, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.forms.web.entrytype;

import javax.servlet.http.HttpServletRequest;

import fr.paris.lutece.plugins.forms.business.FormQuestionResponse;
import fr.paris.lutece.plugins.forms.business.Question;

/**
 * Interface for the entry data services
 */
public interface IEntryDataService
{
    /**
     * @return the data service name
     */
    String getDataServiceName( );

    /**
     * 
     * @param questionResponse
     *            the questionResponse to save
     * @return
     */
    void save( FormQuestionResponse questionResponse );

    /**
     * Creates the response values from request for the given question
     * 
     * @param question
     *            the question to
     * @param request
     *            The Http request
     * @return The response to the question
     */
    FormQuestionResponse createResponseFromRequest( Question question, HttpServletRequest request );

    /**
     * Tests if a response has changed
     * 
     * @param listResponseReference
     *            the reference response
     * @param listResponseNew
     *            the new response
     * @return {@code true} if the response has changed, {@code false} otherwise
     */
    boolean isResponseChanged( FormQuestionResponse responseReference, FormQuestionResponse responseNew );

    /**
     * Converts the specified response into a {@code String}
     * 
     * @param formQuestionResponse
     *            the response to convert
     * @return the {@code String}
     */
    String responseToString( FormQuestionResponse formQuestionResponse );
}
