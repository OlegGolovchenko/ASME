/* #################################################################################
 * MIT License
 * 
 * Copyright (c) 2025 Oleg Golovchenko (IgRok-NET)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * ####################################################################################
 */
package org.igrok_net.asme.plugins.interfaces;

/**
 * Storage provider interface.
 * To create storage provider plugin please
 * use {@link org.igrok_net.asme.plugins.BaseStorageProvider
 * BaseStorageProvider}.
 * 
 * @author Oleg Golovchenko (<a href="https://igrok-net.org">IgRok-NET</a>)
 * @version 0.0.1-alpha
 */
public interface IStorageProvider {
    String getInitialConfigStorage();
}
